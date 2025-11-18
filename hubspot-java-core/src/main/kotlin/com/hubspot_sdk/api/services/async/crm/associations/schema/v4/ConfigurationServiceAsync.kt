// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationServiceAsync

    fun list(): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
        list(ConfigurationListParams.none())

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration>

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none()
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
        list(ConfigurationListParams.none(), requestOptions)

    fun batchCreate(
        toObjectType: String,
        params: ConfigurationBatchCreateParams,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreate(toObjectType, params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        toObjectType: String,
        params: ConfigurationBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchCreate */
    fun batchCreate(
        params: ConfigurationBatchCreateParams
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: ConfigurationBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration>

    fun batchDelete(
        toObjectType: String,
        params: ConfigurationBatchDeleteParams,
    ): CompletableFuture<BatchResponseVoid> =
        batchDelete(toObjectType, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        toObjectType: String,
        params: ConfigurationBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid> =
        batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: ConfigurationBatchDeleteParams): CompletableFuture<BatchResponseVoid> =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: ConfigurationBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid>

    fun batchUpdate(
        toObjectType: String,
        params: ConfigurationBatchUpdateParams,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdate(toObjectType, params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        toObjectType: String,
        params: ConfigurationBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchUpdate */
    fun batchUpdate(
        params: ConfigurationBatchUpdateParams
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: ConfigurationBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>

    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
        getByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
        getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
        getByObjectTypes(params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfiguration>

    /**
     * A view of [ConfigurationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/v4/definitions/configurations/all`, but is otherwise the same as
         * [ConfigurationServiceAsync.list].
         */
        fun list():
            CompletableFuture<
                HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
            > = list(ConfigurationListParams.none())

        /** @see list */
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
        >

        /** @see list */
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
        > = list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create`,
         * but is otherwise the same as [ConfigurationServiceAsync.batchCreate].
         */
        fun batchCreate(
            toObjectType: String,
            params: ConfigurationBatchCreateParams,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreate(toObjectType, params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            toObjectType: String,
            params: ConfigurationBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchCreate */
        fun batchCreate(
            params: ConfigurationBatchCreateParams
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            params: ConfigurationBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        >

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge`,
         * but is otherwise the same as [ConfigurationServiceAsync.batchDelete].
         */
        fun batchDelete(
            toObjectType: String,
            params: ConfigurationBatchDeleteParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(toObjectType, params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            toObjectType: String,
            params: ConfigurationBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDelete */
        fun batchDelete(
            params: ConfigurationBatchDeleteParams
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            params: ConfigurationBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update`,
         * but is otherwise the same as [ConfigurationServiceAsync.batchUpdate].
         */
        fun batchUpdate(
            toObjectType: String,
            params: ConfigurationBatchUpdateParams,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdate(toObjectType, params, RequestOptions.none())

        /** @see batchUpdate */
        fun batchUpdate(
            toObjectType: String,
            params: ConfigurationBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchUpdate */
        fun batchUpdate(
            params: ConfigurationBatchUpdateParams
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        fun batchUpdate(
            params: ConfigurationBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        >

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}`, but is
         * otherwise the same as [ConfigurationServiceAsync.getByObjectTypes].
         */
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
        > = getByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
        > = getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
        > = getByObjectTypes(params, RequestOptions.none())

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration>
        >
    }
}
