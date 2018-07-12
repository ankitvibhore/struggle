package com.struggle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.struggle.model.CveData;
import com.struggle.repository.CveDataRepository;
import com.struggle.repository.CveVendorRepository;
import com.struggle.repository.DescriptionRepository;
import com.struggle.repository.ProblemTypeRepository;
import com.struggle.repository.ReferencesRepository;
import com.struggle.repository.VendorProductRepository;

@Service("cveDataService")
public class CveDataService
{
	private CveDataRepository cveDataRepository;
	private CveVendorRepository cveVendorRepository;
	private DescriptionRepository descriptionRepository;
	private ProblemTypeRepository problemTypeRepository;
	private ReferencesRepository referencesRepository;
	private VendorProductRepository vendorProductRepository;
	
	public CveDataService(CveDataRepository cveDataRepository, CveVendorRepository cveVendorRepository,
			DescriptionRepository descriptionRepository, ProblemTypeRepository problemTypeRepository,
			ReferencesRepository referencesRepository, VendorProductRepository vendorProductRepository) {
		super();
		this.cveDataRepository = cveDataRepository;
		this.cveVendorRepository = cveVendorRepository;
		this.descriptionRepository = descriptionRepository;
		this.problemTypeRepository = problemTypeRepository;
		this.referencesRepository = referencesRepository;
		this.vendorProductRepository = vendorProductRepository;
	}
	
	@SuppressWarnings("unchecked")
	public Iterable<CveData> save(List<CveData> cveData) {
        return (Iterable<CveData>) cveDataRepository.save(cveData);
    }

}
