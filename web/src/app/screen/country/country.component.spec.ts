import { ComponentFixture, TestBed } from '@angular/core/testing';
import { NO_ERRORS_SCHEMA } from '@angular/core';
import { CountryService } from 'src/app/core/services/country.service';
import { CountryComponent } from './country.component';

describe('CountryComponent', () => {
  let component: CountryComponent;
  let fixture: ComponentFixture<CountryComponent>;

  beforeEach(() => {
    const countryServiceStub = () => ({
      getCountrys: () => ({ subscribe: (f: (arg0: {}) => any) => f({}) }),
      getIndicators: (opcaoSelecionada: any) => ({
        subscribe: (f: (arg0: {}) => any) => f({}),
      }),
    });
    TestBed.configureTestingModule({
      schemas: [NO_ERRORS_SCHEMA],
      declarations: [CountryComponent],
      providers: [{ provide: CountryService, useFactory: countryServiceStub }],
    });
    fixture = TestBed.createComponent(CountryComponent);
    component = fixture.componentInstance;
  });

  it('can load instance', () => {
    expect(component).toBeTruthy();
  });

  it(`projetos has default value`, () => {
    expect(component.projetos).toEqual([]);
  });

  it(`opcoesSelecao has default value`, () => {
    expect(component.opcoesSelecao).toEqual([]);
  });

  describe('ngOnInit', () => {
    it('makes expected calls', () => {
      const countryServiceStub: CountryService =
        fixture.debugElement.injector.get(CountryService);
      spyOn(countryServiceStub, 'getCountrys').and.callThrough();
      component.ngOnInit();
      expect(countryServiceStub.getCountrys).toHaveBeenCalled();
    });
  });
});
