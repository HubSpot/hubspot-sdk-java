// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.associationsschema

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot.models.crm.associationsschema.CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
import com.hubspot.models.crm.associationsschema.limits.LimitBatchDeleteParams
import com.hubspot.models.crm.associationsschema.limits.LimitBatchUpdateParams
import com.hubspot.models.crm.associationsschema.limits.LimitGetByObjectTypesParams
import com.hubspot.models.crm.associationsschema.limits.LimitListParams
import java.util.function.Consumer

interface LimitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitService

    /**
     * Retrieve all configured association limits between objects, which include details about how
     * different CRM object types are associated with each other.
     */
    fun list(): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        list(LimitListParams.none())

    /** @see list */
    fun list(
        params: LimitListParams = LimitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging

    /** @see list */
    fun list(
        params: LimitListParams = LimitListParams.none()
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        list(LimitListParams.none(), requestOptions)

    /**
     * Batch delete limits that have been defined for association types between two object types.
     */
    fun batchDelete(toObjectType: String, params: LimitBatchDeleteParams) =
        batchDelete(toObjectType, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        toObjectType: String,
        params: LimitBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: LimitBatchDeleteParams) = batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: LimitBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Batch update association limits that have been configured between two object types. */
    fun batchUpdate(
        toObjectType: String,
        params: LimitBatchUpdateParams,
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdate(toObjectType, params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        toObjectType: String,
        params: LimitBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchUpdate */
    fun batchUpdate(
        params: LimitBatchUpdateParams
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: LimitBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult

    /**
     * Retrieve the configuration details for associations between two specified CRM object types.
     * Use this endpoint to understand limits that have been set for specific association types.
     */
    fun getByObjectTypes(
        toObjectType: String,
        params: LimitGetByObjectTypesParams,
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        getByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        toObjectType: String,
        params: LimitGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: LimitGetByObjectTypesParams
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        getByObjectTypes(params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: LimitGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging

    /** A view of [LimitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/2026-03/definitions/configurations/all`, but is otherwise the same as
         * [LimitService.list].
         */
        @MustBeClosed
        fun list():
            HttpResponseFor<
                CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
            > = list(LimitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LimitListParams = LimitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LimitListParams = LimitListParams.none()
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            list(LimitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge`,
         * but is otherwise the same as [LimitService.batchDelete].
         */
        @MustBeClosed
        fun batchDelete(toObjectType: String, params: LimitBatchDeleteParams): HttpResponse =
            batchDelete(toObjectType, params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            toObjectType: String,
            params: LimitBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(params: LimitBatchDeleteParams): HttpResponse =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: LimitBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update`,
         * but is otherwise the same as [LimitService.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(
            toObjectType: String,
            params: LimitBatchUpdateParams,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdate(toObjectType, params, RequestOptions.none())

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            toObjectType: String,
            params: LimitBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            params: LimitBatchUpdateParams
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            params: LimitBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}`,
         * but is otherwise the same as [LimitService.getByObjectTypes].
         */
        @MustBeClosed
        fun getByObjectTypes(
            toObjectType: String,
            params: LimitGetByObjectTypesParams,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            getByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            toObjectType: String,
            params: LimitGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            params: LimitGetByObjectTypesParams
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            getByObjectTypes(params, RequestOptions.none())

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            params: LimitGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
    }
}
