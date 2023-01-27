import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Foto } from 'src/app/interface/foto.interface';
import { FotosService } from 'src/app/service/fotos.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {

    listaImmagini: Foto[] | undefined;
    sub!:Subscription;
    numeroMiPiace: number = 0;

  constructor(private fotoSrv: FotosService) { }

  ngOnInit(): void {
    this.recuperaFoto();
  }

  recuperaFoto() {
    this.sub = this.fotoSrv.getFoto().subscribe((ris) => {
        console.log(ris);
        this.listaImmagini = ris;
    })
  }

  eliminaFoto(codice:number) {
    this.sub = this.fotoSrv.deleteFoto(codice).subscribe(() => {
        this.listaImmagini = this.listaImmagini?.filter((img) => img.id != codice);
        console.log(`Immagine numero ${codice} cancellata`);
    })
  }

  aggiungiMiPiace() {
    this.fotoSrv.incrementa();
    this.numeroMiPiace = this.fotoSrv.contatore;
  }

  rimuoviMiPiace() {
    this.fotoSrv.decrementa();
    this.numeroMiPiace = this.fotoSrv.contatore;
    if (this.numeroMiPiace<0) {
        this.numeroMiPiace = 0;
    }
  }

}
