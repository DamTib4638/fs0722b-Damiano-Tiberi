import { Injectable } from '@angular/core';
import { User } from '../interface/user.interface';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

    allUsers: User[] = [
        {
            id: 1,
            nome: 'Damiano',
            cognome: 'Tiberi',
            email: 'ddd@ttt.iii'
        },
        {
            id: 2,
            nome: 'Stefano',
            cognome: 'Gavioli',
            email: 'sss@ggg.iii'
        },
        {
            id: 3,
            nome: 'Francesco',
            cognome: 'Pastore',
            email: 'fff@ppp.eee'
        },
        {
            id: 4,
            nome: 'Riccardo',
            cognome: 'Damiani',
            email: 'rrr@ddd.iii'
        },
        {
            id: 5,
            nome: 'Umberto',
            cognome: 'Diodoro',
            email: 'uuu@ddd.ooo'
        },
        {
            id: 6,
            nome: 'Matteo',
            cognome: 'Mengarelli',
            email: 'mmm@mmm.iii'
        }
    ]

  constructor() { }

  getUsers() {
    return this.allUsers;
  }

  getUserById(id:number) {
    let persona = this.allUsers.find((p) => {
        return (p.id == id);
    });
    return persona;
  }
}
