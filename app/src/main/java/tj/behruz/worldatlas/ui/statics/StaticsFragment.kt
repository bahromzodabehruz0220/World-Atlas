package tj.behruz.worldatlas.ui.statics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tj.behruz.worldatlas.databinding.StaticsFragmentBinding

class StaticsFragment : Fragment() {

    private lateinit var binding: StaticsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StaticsFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}