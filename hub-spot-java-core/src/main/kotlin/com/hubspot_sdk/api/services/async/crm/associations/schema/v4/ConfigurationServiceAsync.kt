// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchCreateByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchDeleteByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchUpdateByObjectTypesParams
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

    /** Returns all user configurations available on a given portal */
    fun list():
        CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        list(ConfigurationListParams.none())

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none()
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        list(ConfigurationListParams.none(), requestOptions)

    /** Batch create user configurations between two object types */
    fun batchCreateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchCreateByObjectTypesParams,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreateByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see batchCreateByObjectTypes */
    fun batchCreateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchCreateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreateByObjectTypes(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see batchCreateByObjectTypes */
    fun batchCreateByObjectTypes(
        params: ConfigurationBatchCreateByObjectTypesParams
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreateByObjectTypes(params, RequestOptions.none())

    /** @see batchCreateByObjectTypes */
    fun batchCreateByObjectTypes(
        params: ConfigurationBatchCreateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration>

    /** Batch delete user configurations between two object types */
    fun batchDeleteByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchDeleteByObjectTypesParams,
    ): CompletableFuture<Void?> =
        batchDeleteByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see batchDeleteByObjectTypes */
    fun batchDeleteByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchDeleteByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        batchDeleteByObjectTypes(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see batchDeleteByObjectTypes */
    fun batchDeleteByObjectTypes(
        params: ConfigurationBatchDeleteByObjectTypesParams
    ): CompletableFuture<Void?> = batchDeleteByObjectTypes(params, RequestOptions.none())

    /** @see batchDeleteByObjectTypes */
    fun batchDeleteByObjectTypes(
        params: ConfigurationBatchDeleteByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Batch update user configurations between two object types */
    fun batchUpdateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchUpdateByObjectTypesParams,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdateByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see batchUpdateByObjectTypes */
    fun batchUpdateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchUpdateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdateByObjectTypes(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see batchUpdateByObjectTypes */
    fun batchUpdateByObjectTypes(
        params: ConfigurationBatchUpdateByObjectTypesParams
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        batchUpdateByObjectTypes(params, RequestOptions.none())

    /** @see batchUpdateByObjectTypes */
    fun batchUpdateByObjectTypes(
        params: ConfigurationBatchUpdateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>

    /** Returns user configurations on all association definitions between two object types */
    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        getByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        getByObjectTypes(params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>

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
         * /crm/v4/associations/definitions/configurations/all`, but is otherwise the same as
         * [ConfigurationServiceAsync.list].
         */
        fun list():
            CompletableFuture<
                HttpResponseFor<
                    CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
                >
            > = list(ConfigurationListParams.none())

        /** @see list */
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        >

        /** @see list */
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create`,
         * but is otherwise the same as [ConfigurationServiceAsync.batchCreateByObjectTypes].
         */
        fun batchCreateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchCreateByObjectTypesParams,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreateByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see batchCreateByObjectTypes */
        fun batchCreateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchCreateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > =
            batchCreateByObjectTypes(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchCreateByObjectTypes */
        fun batchCreateByObjectTypes(
            params: ConfigurationBatchCreateByObjectTypesParams
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreateByObjectTypes(params, RequestOptions.none())

        /** @see batchCreateByObjectTypes */
        fun batchCreateByObjectTypes(
            params: ConfigurationBatchCreateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        >

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge`,
         * but is otherwise the same as [ConfigurationServiceAsync.batchDeleteByObjectTypes].
         */
        fun batchDeleteByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchDeleteByObjectTypesParams,
        ): CompletableFuture<HttpResponse> =
            batchDeleteByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see batchDeleteByObjectTypes */
        fun batchDeleteByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchDeleteByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            batchDeleteByObjectTypes(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchDeleteByObjectTypes */
        fun batchDeleteByObjectTypes(
            params: ConfigurationBatchDeleteByObjectTypesParams
        ): CompletableFuture<HttpResponse> = batchDeleteByObjectTypes(params, RequestOptions.none())

        /** @see batchDeleteByObjectTypes */
        fun batchDeleteByObjectTypes(
            params: ConfigurationBatchDeleteByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update`,
         * but is otherwise the same as [ConfigurationServiceAsync.batchUpdateByObjectTypes].
         */
        fun batchUpdateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchUpdateByObjectTypesParams,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdateByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see batchUpdateByObjectTypes */
        fun batchUpdateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchUpdateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > =
            batchUpdateByObjectTypes(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchUpdateByObjectTypes */
        fun batchUpdateByObjectTypes(
            params: ConfigurationBatchUpdateByObjectTypesParams
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > = batchUpdateByObjectTypes(params, RequestOptions.none())

        /** @see batchUpdateByObjectTypes */
        fun batchUpdateByObjectTypes(
            params: ConfigurationBatchUpdateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        >

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}`, but is
         * otherwise the same as [ConfigurationServiceAsync.getByObjectTypes].
         */
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = getByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > = getByObjectTypes(params, RequestOptions.none())

        /** @see getByObjectTypes */
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        >
    }
}
