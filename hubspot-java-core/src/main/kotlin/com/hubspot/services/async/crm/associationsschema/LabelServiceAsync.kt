// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.associationsschema

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot.models.crm.associationsschema.CollectionResponseAssociationSpecWithLabelNoPaging
import com.hubspot.models.crm.associationsschema.labels.LabelBatchCreateParams
import com.hubspot.models.crm.associationsschema.labels.LabelCreateLabelParams
import com.hubspot.models.crm.associationsschema.labels.LabelDeleteLabelParams
import com.hubspot.models.crm.associationsschema.labels.LabelListLabelsParams
import com.hubspot.models.crm.associationsschema.labels.LabelUpdateLabelParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LabelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LabelServiceAsync

    /** Batch configure association limits between two object types. */
    fun batchCreate(
        toObjectType: String,
        params: LabelBatchCreateParams,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreate(toObjectType, params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        toObjectType: String,
        params: LabelBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchCreate */
    fun batchCreate(
        params: LabelBatchCreateParams
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: LabelBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration>

    /**
     * Create a new label that describes the relationship between two specified CRM object types.
     * This can help in categorizing and managing associations more effectively.
     */
    fun createLabel(
        toObjectType: String,
        params: LabelCreateLabelParams,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        createLabel(toObjectType, params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        toObjectType: String,
        params: LabelCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see createLabel */
    fun createLabel(
        params: LabelCreateLabelParams
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        createLabel(params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        params: LabelCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging>

    /** Remove a specific label from the association between two CRM object types. */
    fun deleteLabel(
        associationTypeId: Int,
        params: LabelDeleteLabelParams,
    ): CompletableFuture<Void?> = deleteLabel(associationTypeId, params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        associationTypeId: Int,
        params: LabelDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteLabel(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

    /** @see deleteLabel */
    fun deleteLabel(params: LabelDeleteLabelParams): CompletableFuture<Void?> =
        deleteLabel(params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        params: LabelDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve all labels that describe the relationships between two specified CRM object types.
     * These labels provide context about the nature of the associations.
     */
    fun listLabels(
        toObjectType: String,
        params: LabelListLabelsParams,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        listLabels(toObjectType, params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        toObjectType: String,
        params: LabelListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see listLabels */
    fun listLabels(
        params: LabelListLabelsParams
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        listLabels(params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        params: LabelListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging>

    /**
     * Update an existing label that describes the relationship between two specified CRM object
     * types. This allows for modifications to existing association labels to better reflect the
     * nature of the relationship.
     */
    fun updateLabel(
        toObjectType: String,
        params: LabelUpdateLabelParams,
    ): CompletableFuture<Void?> = updateLabel(toObjectType, params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        toObjectType: String,
        params: LabelUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see updateLabel */
    fun updateLabel(params: LabelUpdateLabelParams): CompletableFuture<Void?> =
        updateLabel(params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        params: LabelUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [LabelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LabelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create`,
         * but is otherwise the same as [LabelServiceAsync.batchCreate].
         */
        fun batchCreate(
            toObjectType: String,
            params: LabelBatchCreateParams,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreate(toObjectType, params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            toObjectType: String,
            params: LabelBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchCreate */
        fun batchCreate(
            params: LabelBatchCreateParams
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > = batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            params: LabelBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        >

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels`, but is otherwise the
         * same as [LabelServiceAsync.createLabel].
         */
        fun createLabel(
            toObjectType: String,
            params: LabelCreateLabelParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            createLabel(toObjectType, params, RequestOptions.none())

        /** @see createLabel */
        fun createLabel(
            toObjectType: String,
            params: LabelCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see createLabel */
        fun createLabel(
            params: LabelCreateLabelParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            createLabel(params, RequestOptions.none())

        /** @see createLabel */
        fun createLabel(
            params: LabelCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels/{associationTypeId}`,
         * but is otherwise the same as [LabelServiceAsync.deleteLabel].
         */
        fun deleteLabel(
            associationTypeId: Int,
            params: LabelDeleteLabelParams,
        ): CompletableFuture<HttpResponse> =
            deleteLabel(associationTypeId, params, RequestOptions.none())

        /** @see deleteLabel */
        fun deleteLabel(
            associationTypeId: Int,
            params: LabelDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteLabel(
                params.toBuilder().associationTypeId(associationTypeId).build(),
                requestOptions,
            )

        /** @see deleteLabel */
        fun deleteLabel(params: LabelDeleteLabelParams): CompletableFuture<HttpResponse> =
            deleteLabel(params, RequestOptions.none())

        /** @see deleteLabel */
        fun deleteLabel(
            params: LabelDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels`, but is otherwise the
         * same as [LabelServiceAsync.listLabels].
         */
        fun listLabels(
            toObjectType: String,
            params: LabelListLabelsParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            listLabels(toObjectType, params, RequestOptions.none())

        /** @see listLabels */
        fun listLabels(
            toObjectType: String,
            params: LabelListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see listLabels */
        fun listLabels(
            params: LabelListLabelsParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            listLabels(params, RequestOptions.none())

        /** @see listLabels */
        fun listLabels(
            params: LabelListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels`, but is otherwise the
         * same as [LabelServiceAsync.updateLabel].
         */
        fun updateLabel(
            toObjectType: String,
            params: LabelUpdateLabelParams,
        ): CompletableFuture<HttpResponse> =
            updateLabel(toObjectType, params, RequestOptions.none())

        /** @see updateLabel */
        fun updateLabel(
            toObjectType: String,
            params: LabelUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see updateLabel */
        fun updateLabel(params: LabelUpdateLabelParams): CompletableFuture<HttpResponse> =
            updateLabel(params, RequestOptions.none())

        /** @see updateLabel */
        fun updateLabel(
            params: LabelUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
