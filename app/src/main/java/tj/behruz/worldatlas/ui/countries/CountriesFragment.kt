package tj.behruz.worldatlas.ui.countries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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


}