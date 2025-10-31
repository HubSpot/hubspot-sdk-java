// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.lists.PublicBatchMigrationMapping
import com.hubspot_sdk.api.models.crm.lists.PublicMigrationMapping
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingBatchCreateIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingGetIdMappingParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MappingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MappingServiceAsync

    /**
     * This API allows translation of a batch of legacy list id's to list id's. This allows for a
     * maximum of 10,000 id's. This is a temporary API allowed for mapping old id's to new id's and
     * will expire on May 30th, 2025.
     */
    fun batchCreateIdMapping(
        params: MappingBatchCreateIdMappingParams
    ): CompletableFuture<PublicBatchMigrationMapping> =
        batchCreateIdMapping(params, RequestOptions.none())

    /** @see batchCreateIdMapping */
    fun batchCreateIdMapping(
        params: MappingBatchCreateIdMappingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBatchMigrationMapping>

    /**
     * This API allows translation of legacy list id to list id. This is a temporary API allowed for
     * mapping old id's to new id's and will expire on May 30th, 2025.
     */
    fun getIdMapping(): CompletableFuture<PublicMigrationMapping> =
        getIdMapping(MappingGetIdMappingParams.none())

    /** @see getIdMapping */
    fun getIdMapping(
        params: MappingGetIdMappingParams = MappingGetIdMappingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMigrationMapping>

    /** @see getIdMapping */
    fun getIdMapping(
        params: MappingGetIdMappingParams = MappingGetIdMappingParams.none()
    ): CompletableFuture<PublicMigrationMapping> = getIdMapping(params, RequestOptions.none())

    /** @see getIdMapping */
    fun getIdMapping(requestOptions: RequestOptions): CompletableFuture<PublicMigrationMapping> =
        getIdMapping(MappingGetIdMappingParams.none(), requestOptions)

    /**
     * A view of [MappingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MappingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/idmapping`, but is otherwise the same
         * as [MappingServiceAsync.batchCreateIdMapping].
         */
        fun batchCreateIdMapping(
            params: MappingBatchCreateIdMappingParams
        ): CompletableFuture<HttpResponseFor<PublicBatchMigrationMapping>> =
            batchCreateIdMapping(params, RequestOptions.none())

        /** @see batchCreateIdMapping */
        fun batchCreateIdMapping(
            params: MappingBatchCreateIdMappingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBatchMigrationMapping>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/idmapping`, but is otherwise the same
         * as [MappingServiceAsync.getIdMapping].
         */
        fun getIdMapping(): CompletableFuture<HttpResponseFor<PublicMigrationMapping>> =
            getIdMapping(MappingGetIdMappingParams.none())

        /** @see getIdMapping */
        fun getIdMapping(
            params: MappingGetIdMappingParams = MappingGetIdMappingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMigrationMapping>>

        /** @see getIdMapping */
        fun getIdMapping(
            params: MappingGetIdMappingParams = MappingGetIdMappingParams.none()
        ): CompletableFuture<HttpResponseFor<PublicMigrationMapping>> =
            getIdMapping(params, RequestOptions.none())

        /** @see getIdMapping */
        fun getIdMapping(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublicMigrationMapping>> =
            getIdMapping(MappingGetIdMappingParams.none(), requestOptions)
    }
}
