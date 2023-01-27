import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-td-form',
  templateUrl: './td-form.component.html',
  styleUrls: ['./td-form.component.scss']
})
export class TdFormComponent implements OnInit {

   stampa:boolean = false;
   contaLettere:string = '';

   @ViewChild('form', {static: true}) form!: NgForm;

   hero: any = {
      nome: '',
      alterEgo: '',
      potere: '',
      nemico: '',
      pianeta: '',
      debolezza: ''
   }

  constructor() { }

  ngOnInit(): void {
   this.form.statusChanges?.subscribe(status => {
      console.log('Stato del form: ', status); // valid / invalid
    });
  }

  submit() {
   console.log('Form inviato: ', this.form);
   this.stampa = true;
   this.hero.nome = this.form.value.heroInfo.nome;
   this.hero.alterEgo = this.form.value.heroInfo.alterEgo;
   this.hero.potere = this.form.value.heroInfo.potere;
   this.hero.nemico = this.form.value.heroInfo.nemico;
   this.hero.pianeta = this.form.value.heroInfo.pianeta;
   this.hero.debolezza = this.form.value.heroInfo.debolezza;
   this.form.reset();
 }

}
