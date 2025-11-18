// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponseAssociationSpecWithLabel
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionCreateLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionDeleteLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionListLabelsParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionUpdateLabelParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DefinitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionServiceAsync

    fun createLabel(
        toObjectType: String,
        params: DefinitionCreateLabelParams,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel> =
        createLabel(toObjectType, params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        toObjectType: String,
        params: DefinitionCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel> =
        createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see createLabel */
    fun createLabel(
        params: DefinitionCreateLabelParams
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel> =
        createLabel(params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        params: DefinitionCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel>

    fun deleteLabel(
        associationTypeId: Int,
        params: DefinitionDeleteLabelParams,
    ): CompletableFuture<Void?> = deleteLabel(associationTypeId, params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        associationTypeId: Int,
        params: DefinitionDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteLabel(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

    /** @see deleteLabel */
    fun deleteLabel(params: DefinitionDeleteLabelParams): CompletableFuture<Void?> =
        deleteLabel(params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        params: DefinitionDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun listLabels(
        toObjectType: String,
        params: DefinitionListLabelsParams,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel> =
        listLabels(toObjectType, params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        toObjectType: String,
        params: DefinitionListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel> =
        listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see listLabels */
    fun listLabels(
        params: DefinitionListLabelsParams
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel> =
        listLabels(params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        params: DefinitionListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabel>

    fun updateLabel(
        toObjectType: String,
        params: DefinitionUpdateLabelParams,
    ): CompletableFuture<Void?> = updateLabel(toObjectType, params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        toObjectType: String,
        params: DefinitionUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see updateLabel */
    fun updateLabel(params: DefinitionUpdateLabelParams): CompletableFuture<Void?> =
        updateLabel(params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        params: DefinitionUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DefinitionServiceAsync] that provides access to raw HTTP responses for each
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
        ): DefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionServiceAsync.createLabel].
         */
        fun createLabel(
            toObjectType: String,
            params: DefinitionCreateLabelParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>> =
            createLabel(toObjectType, params, RequestOptions.none())

        /** @see createLabel */
        fun createLabel(
            toObjectType: String,
            params: DefinitionCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>> =
            createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see createLabel */
        fun createLabel(
            params: DefinitionCreateLabelParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>> =
            createLabel(params, RequestOptions.none())

        /** @see createLabel */
        fun createLabel(
            params: DefinitionCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels/{associationTypeId}`, but is
         * otherwise the same as [DefinitionServiceAsync.deleteLabel].
         */
        fun deleteLabel(
            associationTypeId: Int,
            params: DefinitionDeleteLabelParams,
        ): CompletableFuture<HttpResponse> =
            deleteLabel(associationTypeId, params, RequestOptions.none())

        /** @see deleteLabel */
        fun deleteLabel(
            associationTypeId: Int,
            params: DefinitionDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteLabel(
                params.toBuilder().associationTypeId(associationTypeId).build(),
                requestOptions,
            )

        /** @see deleteLabel */
        fun deleteLabel(params: DefinitionDeleteLabelParams): CompletableFuture<HttpResponse> =
            deleteLabel(params, RequestOptions.none())

        /** @see deleteLabel */
        fun deleteLabel(
            params: DefinitionDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionServiceAsync.listLabels].
         */
        fun listLabels(
            toObjectType: String,
            params: DefinitionListLabelsParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>> =
            listLabels(toObjectType, params, RequestOptions.none())

        /** @see listLabels */
        fun listLabels(
            toObjectType: String,
            params: DefinitionListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>> =
            listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see listLabels */
        fun listLabels(
            params: DefinitionListLabelsParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>> =
            listLabels(params, RequestOptions.none())

        /** @see listLabels */
        fun listLabels(
            params: DefinitionListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabel>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/associations/v4/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionServiceAsync.updateLabel].
         */
        fun updateLabel(
            toObjectType: String,
            params: DefinitionUpdateLabelParams,
        ): CompletableFuture<HttpResponse> =
            updateLabel(toObjectType, params, RequestOptions.none())

        /** @see updateLabel */
        fun updateLabel(
            toObjectType: String,
            params: DefinitionUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see updateLabel */
        fun updateLabel(params: DefinitionUpdateLabelParams): CompletableFuture<HttpResponse> =
            updateLabel(params, RequestOptions.none())

        /** @see updateLabel */
        fun updateLabel(
            params: DefinitionUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
