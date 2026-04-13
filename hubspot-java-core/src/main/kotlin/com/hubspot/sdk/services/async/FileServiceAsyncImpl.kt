// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.files.FileAssetServiceAsync
import com.hubspot.sdk.services.async.files.FileAssetServiceAsyncImpl
import com.hubspot.sdk.services.async.files.FolderServiceAsync
import com.hubspot.sdk.services.async.files.FolderServiceAsyncImpl
import java.util.function.Consumer

class FileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fileAssets: FileAssetServiceAsync by lazy {
        FileAssetServiceAsyncImpl(clientOptions)
    }

    private val folders: FolderServiceAsync by lazy { FolderServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync =
        FileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fileAssets(): FileAssetServiceAsync = fileAssets

    override fun folders(): FolderServiceAsync = folders

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileServiceAsync.WithRawResponse {

        private val fileAssets: FileAssetServiceAsync.WithRawResponse by lazy {
            FileAssetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val folders: FolderServiceAsync.WithRawResponse by lazy {
            FolderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileServiceAsync.WithRawResponse =
            FileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun fileAssets(): FileAssetServiceAsync.WithRawResponse = fileAssets

        override fun folders(): FolderServiceAsync.WithRawResponse = folders
    }
}
