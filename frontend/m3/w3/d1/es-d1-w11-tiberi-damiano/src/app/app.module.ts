import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardComponent } from './components/card/card.component';
import { ErrorsInterceptor } from './interceptors/errors.interceptor';

@NgModule({
  declarations: [
    AppComponent,
    CardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    {
        provide: HTTP_INTERCEPTORS,
        useClass: ErrorsInterceptor,
        multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
