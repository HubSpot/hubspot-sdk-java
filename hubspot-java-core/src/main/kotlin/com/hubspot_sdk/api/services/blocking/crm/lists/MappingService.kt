// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.lists

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.lists.PublicBatchMigrationMapping
import com.hubspot_sdk.api.models.crm.lists.PublicMigrationMapping
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingBatchCreateIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingGetIdMappingParams
import java.util.function.Consumer

interface MappingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MappingService

    /**
     * This API allows translation of a batch of legacy list id's to list id's. This allows for a
     * maximum of 10,000 id's. This is a temporary API allowed for mapping old id's to new id's and
     * will expire on May 30th, 2025.
     */
    fun batchCreateIdMapping(
        params: MappingBatchCreateIdMappingParams
    ): PublicBatchMigrationMapping = batchCreateIdMapping(params, RequestOptions.none())

    /** @see batchCreateIdMapping */
    fun batchCreateIdMapping(
        params: MappingBatchCreateIdMappingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBatchMigrationMapping

    /**
     * This API allows translation of legacy list id to list id. This is a temporary API allowed for
     * mapping old id's to new id's and will expire on May 30th, 2025.
     */
    fun getIdMapping(): PublicMigrationMapping = getIdMapping(MappingGetIdMappingParams.none())

    /** @see getIdMapping */
    fun getIdMapping(
        params: MappingGetIdMappingParams = MappingGetIdMappingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMigrationMapping

    /** @see getIdMapping */
    fun getIdMapping(
        params: MappingGetIdMappingParams = MappingGetIdMappingParams.none()
    ): PublicMigrationMapping = getIdMapping(params, RequestOptions.none())

    /** @see getIdMapping */
    fun getIdMapping(requestOptions: RequestOptions): PublicMigrationMapping =
        getIdMapping(MappingGetIdMappingParams.none(), requestOptions)

    /** A view of [MappingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MappingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/idmapping`, but is otherwise the same
         * as [MappingService.batchCreateIdMapping].
         */
        @MustBeClosed
        fun batchCreateIdMapping(
            params: MappingBatchCreateIdMappingParams
        ): HttpResponseFor<PublicBatchMigrationMapping> =
            batchCreateIdMapping(params, RequestOptions.none())

        /** @see batchCreateIdMapping */
        @MustBeClosed
        fun batchCreateIdMapping(
            params: MappingBatchCreateIdMappingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBatchMigrationMapping>

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/idmapping`, but is otherwise the same
         * as [MappingService.getIdMapping].
         */
        @MustBeClosed
        fun getIdMapping(): HttpResponseFor<PublicMigrationMapping> =
            getIdMapping(MappingGetIdMappingParams.none())

        /** @see getIdMapping */
        @MustBeClosed
        fun getIdMapping(
            params: MappingGetIdMappingParams = MappingGetIdMappingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMigrationMapping>

        /** @see getIdMapping */
        @MustBeClosed
        fun getIdMapping(
            params: MappingGetIdMappingParams = MappingGetIdMappingParams.none()
        ): HttpResponseFor<PublicMigrationMapping> = getIdMapping(params, RequestOptions.none())

        /** @see getIdMapping */
        @MustBeClosed
        fun getIdMapping(requestOptions: RequestOptions): HttpResponseFor<PublicMigrationMapping> =
            getIdMapping(MappingGetIdMappingParams.none(), requestOptions)
    }
}
