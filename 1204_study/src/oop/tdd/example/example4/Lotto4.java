package oop.tdd.example.example4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto4 {
	private String lottoNumber;
	
	public Lotto4() {
		this.lottoNumber = this.generateLottos();
	}

	public String generateLottos() {
		// TODO 로또 세팅.
		Set<Integer> lottoNumbers = new HashSet<Integer>();
		
		//
		while(lottoNumbers.size() < 6) {
			Double d = Math.random()*45+1;
			lottoNumbers.add(d.intValue());
		}
		
		//정렬 여기서만 쓸거기 때문에 
		lottoNumber = this.sortLottos(lottoNumbers);
		 
		return lottoNumber;
	}

	private String sortLottos(Set<Integer> lottoNumbers) {
		// TODO lotto 정렬.
		List<Integer> list = new ArrayList<Integer>(lottoNumbers);
		Collections.sort(list);
		
		return list.toString();
	}

		
}
