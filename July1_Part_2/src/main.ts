import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { appConfig } from './app/app.config';
import { provideHttpClient } from '@angular/common/http';

bootstrapApplication(AppComponent, {
  ...appConfig, // ✅ Spread your app-level config
  providers: [
    ...appConfig.providers,     // 🧠 Spread existing providers from appConfig
    provideHttpClient()         // ✅ Add additional providers like HTTP
  ]
});