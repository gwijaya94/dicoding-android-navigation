package id.gwijaya94.dicodingnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import id.gwijaya94.dicodingnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.btnCategory.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
//        )
        binding.btnCategory.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
        }
        binding.btnProfile.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
        }
        binding.btnToOptAppbar.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_optionAppBarActivity)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}