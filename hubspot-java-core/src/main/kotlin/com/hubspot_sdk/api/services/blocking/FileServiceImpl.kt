// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.files.FileAssetService
import com.hubspot_sdk.api.services.blocking.files.FileAssetServiceImpl
import com.hubspot_sdk.api.services.blocking.files.FolderService
import com.hubspot_sdk.api.services.blocking.files.FolderServiceImpl
import java.util.function.Consumer

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fileAssets: FileAssetService by lazy { FileAssetServiceImpl(clientOptions) }

    private val folders: FolderService by lazy { FolderServiceImpl(clientOptions) }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fileAssets(): FileAssetService = fileAssets

    override fun folders(): FolderService = folders

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val fileAssets: FileAssetService.WithRawResponse by lazy {
            FileAssetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val folders: FolderService.WithRawResponse by lazy {
            FolderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileService.WithRawResponse =
            FileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun fileAssets(): FileAssetService.WithRawResponse = fileAssets

        override fun folders(): FolderService.WithRawResponse = folders
    }
}
