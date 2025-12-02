// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.files.FileOperationServiceAsync
import com.hubspot_sdk.api.services.async.files.FileOperationServiceAsyncImpl
import com.hubspot_sdk.api.services.async.files.FolderServiceAsync
import com.hubspot_sdk.api.services.async.files.FolderServiceAsyncImpl
import java.util.function.Consumer

class FileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fileOperations: FileOperationServiceAsync by lazy {
        FileOperationServiceAsyncImpl(clientOptions)
    }

    private val folders: FolderServiceAsync by lazy { FolderServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync =
        FileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fileOperations(): FileOperationServiceAsync = fileOperations

    override fun folders(): FolderServiceAsync = folders

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileServiceAsync.WithRawResponse {

        private val fileOperations: FileOperationServiceAsync.WithRawResponse by lazy {
            FileOperationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun fileOperations(): FileOperationServiceAsync.WithRawResponse = fileOperations

        override fun folders(): FolderServiceAsync.WithRawResponse = folders
    }
}
