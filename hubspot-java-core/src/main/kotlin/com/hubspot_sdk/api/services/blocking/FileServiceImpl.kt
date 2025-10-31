// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.FileService
import com.hubspot_sdk.api.services.blocking.FileServiceImpl
import com.hubspot_sdk.api.services.blocking.files.FileService
import com.hubspot_sdk.api.services.blocking.files.FileServiceImpl
import com.hubspot_sdk.api.services.blocking.files.FolderService
import com.hubspot_sdk.api.services.blocking.files.FolderServiceImpl
import java.util.function.Consumer

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    private val folders: FolderService by lazy { FolderServiceImpl(clientOptions) }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileService = files

    override fun folders(): FolderService = folders

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
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

        override fun files(): FileService.WithRawResponse = files

        override fun folders(): FolderService.WithRawResponse = folders
    }
}
