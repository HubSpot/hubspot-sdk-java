// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationGetByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationListParams
import java.util.function.Consumer

interface ConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationService

    fun list(): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        list(ConfigurationListParams.none())

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none()
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        list(ConfigurationListParams.none(), requestOptions)

    fun batchCreate(
        toObjectType: String,
        params: ConfigurationBatchCreateParams,
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreate(toObjectType, params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        toObjectType: String,
        params: ConfigurationBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchCreate */
    fun batchCreate(
        params: ConfigurationBatchCreateParams
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: ConfigurationBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionUserConfiguration

    fun batchDelete(
        toObjectType: String,
        params: ConfigurationBatchDeleteParams,
    ): BatchResponseVoid = batchDelete(toObjectType, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        toObjectType: String,
        params: ConfigurationBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid =
        batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: ConfigurationBatchDeleteParams): BatchResponseVoid =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: ConfigurationBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseVoid

    fun batchUpdate(
        toObjectType: String,
        params: ConfigurationBatchUpdateParams,
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdate(toObjectType, params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        toObjectType: String,
        params: ConfigurationBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchUpdate */
    fun batchUpdate(
        params: ConfigurationBatchUpdateParams
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: ConfigurationBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult

    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        getByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        getByObjectTypes(params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration

    /**
     * A view of [ConfigurationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/v4/definitions/configurations/all`, but is otherwise the same as
         * [ConfigurationService.list].
         */
        @MustBeClosed
        fun list():
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            list(ConfigurationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none()
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create`,
         * but is otherwise the same as [ConfigurationService.batchCreate].
         */
        @MustBeClosed
        fun batchCreate(
            toObjectType: String,
            params: ConfigurationBatchCreateParams,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreate(toObjectType, params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            toObjectType: String,
            params: ConfigurationBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: ConfigurationBatchCreateParams
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: ConfigurationBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge`,
         * but is otherwise the same as [ConfigurationService.batchDelete].
         */
        @MustBeClosed
        fun batchDelete(
            toObjectType: String,
            params: ConfigurationBatchDeleteParams,
        ): HttpResponseFor<BatchResponseVoid> =
            batchDelete(toObjectType, params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            toObjectType: String,
            params: ConfigurationBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid> =
            batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: ConfigurationBatchDeleteParams
        ): HttpResponseFor<BatchResponseVoid> = batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: ConfigurationBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseVoid>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update`,
         * but is otherwise the same as [ConfigurationService.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(
            toObjectType: String,
            params: ConfigurationBatchUpdateParams,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdate(toObjectType, params, RequestOptions.none())

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            toObjectType: String,
            params: ConfigurationBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            params: ConfigurationBatchUpdateParams
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            params: ConfigurationBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}`, but is
         * otherwise the same as [ConfigurationService.getByObjectTypes].
         */
        @MustBeClosed
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            getByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            getByObjectTypes(params, RequestOptions.none())

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
    }
}
