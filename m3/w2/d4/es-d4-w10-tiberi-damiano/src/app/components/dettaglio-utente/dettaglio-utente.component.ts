import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { User } from 'src/app/interface/user.interface';
import { UsersService } from 'src/app/service/users.service';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-dettaglio-utente',
  templateUrl: './dettaglio-utente.component.html',
  styleUrls: ['./dettaglio-utente.component.scss']
})
export class DettaglioUtenteComponent implements OnInit {

    user: User | undefined;
    sub!: Subscription;

  constructor(private ar:ActivatedRoute, private userSrv: UsersService) { }

  ngOnInit(): void {
    // let id = this.ar.snapshot.params['id'];
    this.sub = this.ar.params.subscribe((params: Params) => {
        const id = +params['id'];
        this.user = this.userSrv.getUserById(id);
    })
  }

}
