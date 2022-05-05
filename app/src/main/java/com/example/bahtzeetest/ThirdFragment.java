package com.example.bahtzeetest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.bahtzeetest.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {
    private FragmentThirdBinding binding;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainActivity) getActivity()).showScore(view);
        binding.setScoreOne.setOnClickListener(view1 -> {
            ((MainActivity) getActivity()).setScoreOne(view1);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreTwo.setOnClickListener(view12 -> {
            ((MainActivity) getActivity()).setScoreTwo(view12);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreThree.setOnClickListener(view13 -> {
            ((MainActivity) getActivity()).setScoreThree(view13);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreFour.setOnClickListener(view14 -> {
            ((MainActivity) getActivity()).setScoreFour(view14);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreFive.setOnClickListener(view15 -> {
            ((MainActivity) getActivity()).setScoreFive(view15);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreSix.setOnClickListener(view16 -> {
            ((MainActivity) getActivity()).setScoreSix(view16);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScore3ok.setOnClickListener(view17 -> {
            ((MainActivity) getActivity()).setThreeOfKind(view17);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScore4ok.setOnClickListener(view113 -> {
            ((MainActivity) getActivity()).setFourOfKind(view113);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreFullHouse.setOnClickListener(view112 -> {
            ((MainActivity) getActivity()).setFullHouse(view112);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreSmStrt.setOnClickListener(view111 -> {
            ((MainActivity) getActivity()).setScoreSmStrt(view111);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreLrgStrt.setOnClickListener(view110 -> {
            ((MainActivity) getActivity()).setScoreLrgStrt(view110);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreChance.setOnClickListener(view19 -> {
            ((MainActivity) getActivity()).setScoreChance(view19);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
        binding.setScoreYahtzee.setOnClickListener(view18 -> {
            ((MainActivity) getActivity()).setScoreYahtzee(view18);
            NavHostFragment.findNavController(ThirdFragment.this)
                    .navigate(R.id.action_ThirdFragment_to_SecondFragment);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
