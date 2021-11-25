package id.gwijaya94.dicodingnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import id.gwijaya94.dicodingnavigation.databinding.FragmentDetailCategoryBinding


class DetailCategoryFragment : Fragment() {
    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
//        val dataDescription = arguments?.getLong(CategoryFragment.EXTRA_STOCK)

        val argBundle = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle)
        val dataName = argBundle.name
        val dataDescription = argBundle.stock

        val toHomeFragmentDirections =
            DetailCategoryFragmentDirections.actionDetailCategoryFragmentToHomeFragment()
        binding.apply {
            tvCategoryName.text = dataName
            tvCategoryDescription.text = "Stock: $dataDescription"
            btnProfile.setOnClickListener(
                Navigation.createNavigateOnClickListener(
                    toHomeFragmentDirections
                )
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {

    }
}