package com.jude.interceptor.app;

import com.afollestad.materialdialogs.MaterialDialog;
import com.jude.beam.expansion.BeamBaseActivity;
import com.jude.beam.expansion.overlay.DefaultViewExpansionDelegate;

public class NewViewExpansion extends DefaultViewExpansionDelegate {
    public NewViewExpansion(BeamBaseActivity activity) {
        super(activity);
    }

    private MaterialDialog mProgressDialog;


    @Override
    public void showProgressDialog(String title) {
        if (mProgressDialog!=null)mProgressDialog.dismiss();
        mProgressDialog = new MaterialDialog.Builder(getActivity())
                .progress(true,100)
                .cancelable(false)
                .content(title)
                .show();
    }

    @Override
    public void dismissProgressDialog() {
        if (mProgressDialog!=null)mProgressDialog.dismiss();
    }

}
