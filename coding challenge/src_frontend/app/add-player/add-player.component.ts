import { Component } from '@angular/core';
import { PlayerService } from '../player.service';
import { Player } from '../Player';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent {

constructor(private playerService: PlayerService){}

insertPlayer(data:Player){
    
  this.playerService.addPlayer(data)
  .subscribe(
    (player)=>{console.log('Added Player is: '+player);}
    );

  }
}