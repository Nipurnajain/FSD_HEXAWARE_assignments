import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPlayerComponent } from './add-player/add-player.component';

import { GetAllPlayersComponent } from './get-all-players/get-all-players.component';

const routes: Routes = [

{path:'addPlayer', component:AddPlayerComponent},
{path:'getAllPlayers', component:GetAllPlayersComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }





