import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from './Player';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http: HttpClient) { }


  baseURL:string = 'http://localhost:8080/api/cricket/';

  getAllPlayers():Observable<Player[]>{

      return this.http.get<Player[]>(this.baseURL+"getAllPlayers");


  }

  addPlayer(body:Player):Observable<Player>{

    console.log(body);

      return this.http.post<Player>(this.baseURL+"addPlayer",body);

  }

  
}
