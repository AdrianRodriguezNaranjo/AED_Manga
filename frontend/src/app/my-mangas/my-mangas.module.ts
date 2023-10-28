import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { MyMangasPageRoutingModule } from './my-mangas-routing.module';

import { MyMangasPage } from './my-mangas.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    MyMangasPageRoutingModule
  ],
  declarations: [MyMangasPage]
})
export class MyMangasPageModule {}
