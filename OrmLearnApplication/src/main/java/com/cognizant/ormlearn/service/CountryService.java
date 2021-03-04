package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {
		List<Country> countries = countryRepository.findAll();
		return countries;
	}

	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(countryCode);
		if (!result.isPresent()) {
			throw new CountryNotFoundException("Country Not Found");
		} else {
			Country country = result.get();
			return country;
		}
	}

	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}

	@Transactional
	public void updateCountry(String code, String name) {
		Country country = countryRepository.findById(code).orElse(null);
		country.setName(name);
		countryRepository.save(country);
	}

	@Transactional
	public void deleteCountry(String code) {
		countryRepository.deleteById(code);
	}
	@Transactional
	public List<Country> searchByPlaceHolder(String placeHolder)
	{
		return countryRepository.findByNameContaining(placeHolder);
	}
	@Transactional
	public List<Country> searchByStartingLetter(String startLetter)
	{
		return countryRepository.findByNameStartingWith(startLetter);
	}
	@Transactional
	public List<Country> sortCountriesContaining(String placeHolder)
	{
		return countryRepository.findByNameContainingOrderByNameAsc(placeHolder);
	}
}
