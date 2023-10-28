import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { MyMangasPage } from './my-mangas.page';

const routes: Routes = [
  {
    path: '',
    component: MyMangasPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MyMangasPageRoutingModule {}
