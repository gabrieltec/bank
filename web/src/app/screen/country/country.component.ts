import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CountryService } from 'src/app/core/services/country.service';

@Component({
  selector: 'app-tasks',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.scss'],
})
export class CountryComponent implements OnInit {
  projetos: any[] = [];
  opcoesSelecao: string[] = []; // Adicione as opções desejadas.

  constructor(public countryService: CountryService) {}

  ngOnInit() {
    this.countryService.getCountrys().subscribe((data) => {
      console.log(data);

      if (data && data[1]) {
        this.projetos = data[1];
      }
    });
    this.getIndicators(this.opcoesSelecao[0]); // Para carregar a lista inicial com base na primeira opção.
  }

  onChangeSelecao(opcaoSelecionada: string) {
    this.getIndicators(opcaoSelecionada);
  }

  private getIndicators(opcaoSelecionada: string) {
    this.countryService.getIndicators(opcaoSelecionada).subscribe((data) => {
      if (data && data[1]) {
        this.projetos = data[1];
      }
    });
  }
}
