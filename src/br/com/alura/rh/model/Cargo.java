package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return null;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return null;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return null;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximoCargo() {
			return null;
		}
	};

	public abstract Cargo getProximoCargo();
}
