package tj.behruz.worldatlas.ui.countries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import tj.behruz.worldatlas.R
import tj.behruz.worldatlas.databinding.CountriesFragmentBinding

class CountriesFragment : Fragment() {

    private lateinit var binding: CountriesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CountriesFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = CountryAdapter() {
            findNavController().navigate(R.id.action_countriesFragment_to_countryDetailFragment)
        }

        binding.countryRV.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.countryRV.adapter = adapter


    }


}