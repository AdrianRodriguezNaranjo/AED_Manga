import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { MangaDetailsPageRoutingModule } from './manga-details-routing.module';

import { MangaDetailsPage } from './manga-details.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    MangaDetailsPageRoutingModule
  ],
  declarations: [MangaDetailsPage]
})
export class MangaDetailsPageModule {}
