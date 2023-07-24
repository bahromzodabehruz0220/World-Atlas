package tj.behruz.worldatlas.ui.more

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tj.behruz.worldatlas.databinding.MoreFragmentBinding

class MoreFragment : Fragment() {
    private lateinit var binding: MoreFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MoreFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}