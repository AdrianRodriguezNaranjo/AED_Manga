import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { MangaDetailsPage } from './manga-details.page';

const routes: Routes = [
  {
    path: '',
    component: MangaDetailsPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MangaDetailsPageRoutingModule {}
