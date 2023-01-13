import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ArticleServiceService } from './article-service.service';
import { ArticlesComponent } from './articles/articles.component';
import { AddComponent } from './add/add.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { OrderComponent } from './order/order.component';

@NgModule({
  declarations: [AppComponent, ArticlesComponent, AddComponent, OrderComponent],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: '', redirectTo: 'Articles', pathMatch: 'full' },
      { path: 'Articles', component: ArticlesComponent },
      { path: 'Articles/add', component: AddComponent },
      { path: 'orders', component: OrderComponent },
    ]),
  ],
  providers: [ArticleServiceService],
  bootstrap: [AppComponent],
})
export class AppModule {}
