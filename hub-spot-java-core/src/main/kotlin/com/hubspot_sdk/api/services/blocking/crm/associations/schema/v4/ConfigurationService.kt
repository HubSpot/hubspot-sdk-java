// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.google.errorprone.annotations.MustBeClosed
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

    /** Returns all user configurations available on a given portal */
    fun list(): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        list(ConfigurationListParams.none())

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging

    /** @see list */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none()
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        list(ConfigurationListParams.none(), requestOptions)

    /** Batch create user configurations between two object types */
    fun batchCreateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchCreateByObjectTypesParams,
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreateByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see batchCreateByObjectTypes */
    fun batchCreateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchCreateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreateByObjectTypes(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see batchCreateByObjectTypes */
    fun batchCreateByObjectTypes(
        params: ConfigurationBatchCreateByObjectTypesParams
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreateByObjectTypes(params, RequestOptions.none())

    /** @see batchCreateByObjectTypes */
    fun batchCreateByObjectTypes(
        params: ConfigurationBatchCreateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionUserConfiguration

    /** Batch delete user configurations between two object types */
    fun batchDeleteByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchDeleteByObjectTypesParams,
    ) = batchDeleteByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see batchDeleteByObjectTypes */
    fun batchDeleteByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchDeleteByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        batchDeleteByObjectTypes(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see batchDeleteByObjectTypes */
    fun batchDeleteByObjectTypes(params: ConfigurationBatchDeleteByObjectTypesParams) =
        batchDeleteByObjectTypes(params, RequestOptions.none())

    /** @see batchDeleteByObjectTypes */
    fun batchDeleteByObjectTypes(
        params: ConfigurationBatchDeleteByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Batch update user configurations between two object types */
    fun batchUpdateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchUpdateByObjectTypesParams,
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdateByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see batchUpdateByObjectTypes */
    fun batchUpdateByObjectTypes(
        toObjectType: String,
        params: ConfigurationBatchUpdateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdateByObjectTypes(
            params.toBuilder().toObjectType(toObjectType).build(),
            requestOptions,
        )

    /** @see batchUpdateByObjectTypes */
    fun batchUpdateByObjectTypes(
        params: ConfigurationBatchUpdateByObjectTypesParams
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        batchUpdateByObjectTypes(params, RequestOptions.none())

    /** @see batchUpdateByObjectTypes */
    fun batchUpdateByObjectTypes(
        params: ConfigurationBatchUpdateByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult

    /** Returns user configurations on all association definitions between two object types */
    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        getByObjectTypes(toObjectType, params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        toObjectType: String,
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
        getByObjectTypes(params, RequestOptions.none())

    /** @see getByObjectTypes */
    fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging

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
         * /crm/v4/associations/definitions/configurations/all`, but is otherwise the same as
         * [ConfigurationService.list].
         */
        @MustBeClosed
        fun list():
            HttpResponseFor<
                CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
            > = list(ConfigurationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none()
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create`,
         * but is otherwise the same as [ConfigurationService.batchCreateByObjectTypes].
         */
        @MustBeClosed
        fun batchCreateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchCreateByObjectTypesParams,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreateByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see batchCreateByObjectTypes */
        @MustBeClosed
        fun batchCreateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchCreateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreateByObjectTypes(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchCreateByObjectTypes */
        @MustBeClosed
        fun batchCreateByObjectTypes(
            params: ConfigurationBatchCreateByObjectTypesParams
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreateByObjectTypes(params, RequestOptions.none())

        /** @see batchCreateByObjectTypes */
        @MustBeClosed
        fun batchCreateByObjectTypes(
            params: ConfigurationBatchCreateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge`,
         * but is otherwise the same as [ConfigurationService.batchDeleteByObjectTypes].
         */
        @MustBeClosed
        fun batchDeleteByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchDeleteByObjectTypesParams,
        ): HttpResponse = batchDeleteByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see batchDeleteByObjectTypes */
        @MustBeClosed
        fun batchDeleteByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchDeleteByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            batchDeleteByObjectTypes(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchDeleteByObjectTypes */
        @MustBeClosed
        fun batchDeleteByObjectTypes(
            params: ConfigurationBatchDeleteByObjectTypesParams
        ): HttpResponse = batchDeleteByObjectTypes(params, RequestOptions.none())

        /** @see batchDeleteByObjectTypes */
        @MustBeClosed
        fun batchDeleteByObjectTypes(
            params: ConfigurationBatchDeleteByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update`,
         * but is otherwise the same as [ConfigurationService.batchUpdateByObjectTypes].
         */
        @MustBeClosed
        fun batchUpdateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchUpdateByObjectTypesParams,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdateByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see batchUpdateByObjectTypes */
        @MustBeClosed
        fun batchUpdateByObjectTypes(
            toObjectType: String,
            params: ConfigurationBatchUpdateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdateByObjectTypes(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchUpdateByObjectTypes */
        @MustBeClosed
        fun batchUpdateByObjectTypes(
            params: ConfigurationBatchUpdateByObjectTypesParams
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            batchUpdateByObjectTypes(params, RequestOptions.none())

        /** @see batchUpdateByObjectTypes */
        @MustBeClosed
        fun batchUpdateByObjectTypes(
            params: ConfigurationBatchUpdateByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}`, but is
         * otherwise the same as [ConfigurationService.getByObjectTypes].
         */
        @MustBeClosed
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            getByObjectTypes(toObjectType, params, RequestOptions.none())

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            toObjectType: String,
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            getByObjectTypes(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            getByObjectTypes(params, RequestOptions.none())

        /** @see getByObjectTypes */
        @MustBeClosed
        fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
    }
}
