// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associationsschema

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot_sdk.api.models.crm.associationsschema.CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitGetByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LimitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitServiceAsync

    /**
     * Fetch all limits for CRM associations, which include details about cardinality limits (i.e.,
     * one-to-many vs one-to-one).
     */
    fun list():
        CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        list(LimitListParams.none())

    /** @see list */
    fun list(
        params: LimitListParams = LimitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>

    /** @see list */
    fun list(
        params: LimitListParams = LimitListParams.none()
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        list(LimitListParams.none(), requestOptions)

    /** Batch delete limits defined for associations between two specified CRM object types. */
    fun batchDelete(
        toObjectType: String,
        params: LimitBatchDeleteParams,
    ): CompletableFuture<BatchResponseVoid> =
        batchDelete(toObjectType, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        toObjectType: String,
        params: LimitBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid> =
        batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: LimitBatchDeleteParams): CompletableFuture<BatchResponseVoid> =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: LimitBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid>

    /**
     * Update multiple association configurations between two specified CRM object types in a single
     * batch operation. This defines details about cardinality limits (i.e., one-to-many vs
     * one-to-one).
     */
    fun batchUpdate(
        toObjectType: String,
        params: LimitBatchUpdateParams,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdate(toObjectType, params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        toObjectType: String,
        params: LimitBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchUpdate */
    fun batchUpdate(
        params: LimitBatchUpdateParams
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: LimitBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>

    /**
     * Retrieve the cardinality limits for associations between two specified CRM object types
     * (i.e., one-to-many vs one-to-one).
     */
    fun getByObjectTypes(
        toObjectType: String,
        params: LimitGetByObjectTypesParams,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        getByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        toObjectType: String,
        params: LimitGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: LimitGetByObjectTypesParams
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        getByObjectTypes(params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: LimitGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>

    /** A view of [LimitServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/2026-03/definitions/configurations/all`, but is otherwise the same as
         * [LimitServiceAsync.list].
         */
        fun list():
            CompletableFuture<
                HttpResponseFor<
                    CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
                >
            > = list(LimitListParams.none())

        /** @see list */
        fun list(
            params: LimitListParams = LimitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        >

        /** @see list */
        fun list(
            params: LimitListParams = LimitListParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = list(LimitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge`,
         * but is otherwise the same as [LimitServiceAsync.batchDelete].
         */
        fun batchDelete(
            toObjectType: String,
            params: LimitBatchDeleteParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(toObjectType, params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            toObjectType: String,
            params: LimitBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDelete */
        fun batchDelete(
            params: LimitBatchDeleteParams
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            params: LimitBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update`,
         * but is otherwise the same as [LimitServiceAsync.batchUpdate].
         */
        fun batchUpdate(
            toObjectType: String,
            params: LimitBatchUpdateParams,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdate(toObjectType, params, RequestOptions.none())

        /** @see batchUpdate */
        fun batchUpdate(
            toObjectType: String,
            params: LimitBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchUpdate */
        fun batchUpdate(
            params: LimitBatchUpdateParams
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        fun batchUpdate(
            params: LimitBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        >

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}`,
         * but is otherwise the same as [LimitServiceAsync.getByObjectTypes].
         */
        fun getByObjectTypes(
            toObjectType: String,
            params: LimitGetByObjectTypesParams,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = getByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            toObjectType: String,
            params: LimitGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            params: LimitGetByObjectTypesParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = getByObjectTypes(params, RequestOptions.none())

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            params: LimitGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        >
    }
}
