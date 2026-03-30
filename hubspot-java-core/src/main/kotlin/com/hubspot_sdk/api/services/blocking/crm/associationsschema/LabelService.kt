// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associationsschema

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associationsschema.CollectionResponseAssociationSpecWithLabelNoPaging
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelBatchCreateParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelCreateLabelParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelDeleteLabelParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelListLabelsParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelUpdateLabelParams
import java.util.function.Consumer

interface LabelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LabelService

    /** Batch configure association limits between two object types. */
    fun batchCreate(
        toObjectType: String,
        params: LabelBatchCreateParams,
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreate(toObjectType, params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        toObjectType: String,
        params: LabelBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchCreate */
    fun batchCreate(
        params: LabelBatchCreateParams
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: LabelBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationDefinitionUserConfiguration

    /**
     * Create a new label that describes the relationship between two specified CRM object types.
     * This can help in categorizing and managing associations more effectively.
     */
    fun createLabel(
        toObjectType: String,
        params: LabelCreateLabelParams,
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        createLabel(toObjectType, params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        toObjectType: String,
        params: LabelCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see createLabel */
    fun createLabel(
        params: LabelCreateLabelParams
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        createLabel(params, RequestOptions.none())

    /** @see createLabel */
    fun createLabel(
        params: LabelCreateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging

    /** Remove a specific label from the association between two CRM object types. */
    fun deleteLabel(associationTypeId: Int, params: LabelDeleteLabelParams) =
        deleteLabel(associationTypeId, params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        associationTypeId: Int,
        params: LabelDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteLabel(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

    /** @see deleteLabel */
    fun deleteLabel(params: LabelDeleteLabelParams) = deleteLabel(params, RequestOptions.none())

    /** @see deleteLabel */
    fun deleteLabel(
        params: LabelDeleteLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieve all labels that describe the relationships between two specified CRM object types.
     * These labels provide context about the nature of the associations.
     */
    fun listLabels(
        toObjectType: String,
        params: LabelListLabelsParams,
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        listLabels(toObjectType, params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        toObjectType: String,
        params: LabelListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see listLabels */
    fun listLabels(
        params: LabelListLabelsParams
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        listLabels(params, RequestOptions.none())

    /** @see listLabels */
    fun listLabels(
        params: LabelListLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging

    /**
     * Update an existing label that describes the relationship between two specified CRM object
     * types. This allows for modifications to existing association labels to better reflect the
     * nature of the relationship.
     */
    fun updateLabel(toObjectType: String, params: LabelUpdateLabelParams) =
        updateLabel(toObjectType, params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        toObjectType: String,
        params: LabelUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see updateLabel */
    fun updateLabel(params: LabelUpdateLabelParams) = updateLabel(params, RequestOptions.none())

    /** @see updateLabel */
    fun updateLabel(
        params: LabelUpdateLabelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [LabelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LabelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create`,
         * but is otherwise the same as [LabelService.batchCreate].
         */
        @MustBeClosed
        fun batchCreate(
            toObjectType: String,
            params: LabelBatchCreateParams,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreate(toObjectType, params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            toObjectType: String,
            params: LabelBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: LabelBatchCreateParams
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: LabelBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels`, but is otherwise the
         * same as [LabelService.createLabel].
         */
        @MustBeClosed
        fun createLabel(
            toObjectType: String,
            params: LabelCreateLabelParams,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            createLabel(toObjectType, params, RequestOptions.none())

        /** @see createLabel */
        @MustBeClosed
        fun createLabel(
            toObjectType: String,
            params: LabelCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            createLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see createLabel */
        @MustBeClosed
        fun createLabel(
            params: LabelCreateLabelParams
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            createLabel(params, RequestOptions.none())

        /** @see createLabel */
        @MustBeClosed
        fun createLabel(
            params: LabelCreateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels/{associationTypeId}`,
         * but is otherwise the same as [LabelService.deleteLabel].
         */
        @MustBeClosed
        fun deleteLabel(associationTypeId: Int, params: LabelDeleteLabelParams): HttpResponse =
            deleteLabel(associationTypeId, params, RequestOptions.none())

        /** @see deleteLabel */
        @MustBeClosed
        fun deleteLabel(
            associationTypeId: Int,
            params: LabelDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteLabel(
                params.toBuilder().associationTypeId(associationTypeId).build(),
                requestOptions,
            )

        /** @see deleteLabel */
        @MustBeClosed
        fun deleteLabel(params: LabelDeleteLabelParams): HttpResponse =
            deleteLabel(params, RequestOptions.none())

        /** @see deleteLabel */
        @MustBeClosed
        fun deleteLabel(
            params: LabelDeleteLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels`, but is otherwise the
         * same as [LabelService.listLabels].
         */
        @MustBeClosed
        fun listLabels(
            toObjectType: String,
            params: LabelListLabelsParams,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            listLabels(toObjectType, params, RequestOptions.none())

        /** @see listLabels */
        @MustBeClosed
        fun listLabels(
            toObjectType: String,
            params: LabelListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            listLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see listLabels */
        @MustBeClosed
        fun listLabels(
            params: LabelListLabelsParams
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            listLabels(params, RequestOptions.none())

        /** @see listLabels */
        @MustBeClosed
        fun listLabels(
            params: LabelListLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>

        /**
         * Returns a raw HTTP response for `put
         * /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels`, but is otherwise the
         * same as [LabelService.updateLabel].
         */
        @MustBeClosed
        fun updateLabel(toObjectType: String, params: LabelUpdateLabelParams): HttpResponse =
            updateLabel(toObjectType, params, RequestOptions.none())

        /** @see updateLabel */
        @MustBeClosed
        fun updateLabel(
            toObjectType: String,
            params: LabelUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLabel(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see updateLabel */
        @MustBeClosed
        fun updateLabel(params: LabelUpdateLabelParams): HttpResponse =
            updateLabel(params, RequestOptions.none())

        /** @see updateLabel */
        @MustBeClosed
        fun updateLabel(
            params: LabelUpdateLabelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
