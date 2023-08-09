import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class CountryService {
  constructor(private http: HttpClient) {}
  project: any;
  private readonly URL_BASE = 'localhost:8080';
  private readonly URL_TASK = `${this.URL_BASE}/api/task`;
  baseUrl = `http://localhost:8080/`;

  public getIndicators(opcaoSelecionada: String) {
    return this.http.get<any[]>(`${this.baseUrl}country/${opcaoSelecionada}`);
  }

  public getCountrys() {
    return this.http.get<any[]>(`${this.baseUrl}country`);
  }
}
