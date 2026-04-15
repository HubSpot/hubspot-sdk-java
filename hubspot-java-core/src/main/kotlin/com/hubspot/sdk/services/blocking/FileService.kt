// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.files.FileAssetService
import com.hubspot.sdk.services.blocking.files.FolderService
import java.util.function.Consumer

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    fun fileAssets(): FileAssetService

    fun folders(): FolderService

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        fun fileAssets(): FileAssetService.WithRawResponse

        fun folders(): FolderService.WithRawResponse
    }
}
