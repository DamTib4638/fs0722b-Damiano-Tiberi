import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormArray, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-react-form',
  templateUrl: './react-form.component.html',
  styleUrls: ['./react-form.component.scss']
})
export class ReactFormComponent implements OnInit {

   form!: FormGroup;
   stampa:boolean = false;

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
   this.form = this.fb.group({
      nome: this.fb.control(null, Validators.required),
      alterEgo: this.fb.control(null, Validators.required),
      poteri: this.fb.array(['']),
      nemico: this.fb.control(null, Validators.maxLength(10)),
      pianeta: this.fb.control(null, [Validators.required, Validators.minLength(5)]),
      debolezze: this.fb.array([''])
    });
    this.form.valueChanges.subscribe(value => {
      console.log(value);
    })
  }

  getFormC(name:string) {
   return this.form.get(name);
 }

  getErrorsC(name:string, error:string) {
   return this.form.get(name)?.errors![error];
 }

 aggiungiSuperPotere() {
   const control = this.fb.control(null);
   (this.form.get('poteri') as FormArray).push(control);
   console.log(this.getSuperPotereF());
 }

 getSuperPotereF() {
   return (this.form.get('poteri') as FormArray).controls;
 }

 aggiungiDebolezza() {
   const control = this.fb.control(null);
   (this.form.get('debolezze') as FormArray).push(control);
   console.log(this.getDebolezzaF());
 }

 getDebolezzaF() {
   return (this.form.get('debolezze') as FormArray).controls;
 }

 submit() {
   this.stampa = true;
   console.log(this.form);
   console.log('Form correttamente inviato');
   this.getDebolezzaF().length = 1;
   this.getSuperPotereF().length = 1;
   this.form.reset();
 }

}
