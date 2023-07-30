package tj.behruz.worldatlas.ui.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import tj.behruz.worldatlas.databinding.QuizFragmentBinding
@AndroidEntryPoint

class QuizFragment : Fragment() {

    private lateinit var binding: QuizFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = QuizFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}