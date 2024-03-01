import { Component } from '@angular/core';
import { Player } from '../Player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-get-all-players',
  templateUrl: './get-all-players.component.html',
  styleUrls: ['./get-all-players.component.css']
})
export class GetAllPlayersComponent {


  playerList: Player[] = [];

  constructor(private playerService: PlayerService) { }


  ngOnInit() {

    this.getAllPlayers();

  }


  getAllPlayers() {

    this.playerService.getAllPlayers().subscribe(
      (list) => { this.playerList = list; console.log(list) }

    );



  }


}
