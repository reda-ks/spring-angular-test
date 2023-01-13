import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ArticlesComponent } from './articles/articles.component';

const routes: Routes = [
// { path: '', redirectTo: 'Articles', pathMatch: 'full' },

  //{ path: 'Articles', component: ArticlesComponent },
  //{ path: 'Articles/add', component: AddComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
