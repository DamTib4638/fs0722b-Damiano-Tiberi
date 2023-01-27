import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-terzo-componente',
  templateUrl: './terzo-componente.component.html',
  styleUrls: ['./terzo-componente.component.scss']
})
export class TerzoComponenteComponent implements OnInit {

  constructor() { }

  titolo3 = 'Terzo Componente';
  red = 'Miss Scarlett';
  gold = 'Mr. Mustard';
  black = 'Dr. Black';

  ngOnInit(): void {
  }

}
