import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-secondo-componente',
  templateUrl: './secondo-componente.component.html',
  styleUrls: ['./secondo-componente.component.scss']
})
export class SecondoComponenteComponent implements OnInit {

  constructor() { }

  titolo2 = 'Secondo Componente';
  green = 'Reverendo Green';
  plum = 'Mr. Plum';
  peacock = 'Miss Peacock';

  ngOnInit(): void {
  }

}
