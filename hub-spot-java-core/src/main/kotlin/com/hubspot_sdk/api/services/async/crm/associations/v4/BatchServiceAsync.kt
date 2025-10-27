// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponsePublicAssociationMultiWithLabel
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchAssociateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchReadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /** Create the default (most generic) association type between two object types */
    fun batchAssociateDefault(
        toObjectType: String,
        params: BatchBatchAssociateDefaultParams,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        batchAssociateDefault(toObjectType, params, RequestOptions.none())

    /** @see batchAssociateDefault */
    fun batchAssociateDefault(
        toObjectType: String,
        params: BatchBatchAssociateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        batchAssociateDefault(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchAssociateDefault */
    fun batchAssociateDefault(
        params: BatchBatchAssociateDefaultParams
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        batchAssociateDefault(params, RequestOptions.none())

    /** @see batchAssociateDefault */
    fun batchAssociateDefault(
        params: BatchBatchAssociateDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation>

    /** Batch create associations for objects */
    fun batchCreate(
        toObjectType: String,
        params: BatchBatchCreateParams,
    ): CompletableFuture<BatchResponseLabelsBetweenObjectPair> =
        batchCreate(toObjectType, params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        toObjectType: String,
        params: BatchBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseLabelsBetweenObjectPair> =
        batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchCreate */
    fun batchCreate(
        params: BatchBatchCreateParams
    ): CompletableFuture<BatchResponseLabelsBetweenObjectPair> =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: BatchBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseLabelsBetweenObjectPair>

    /** Batch delete associations for objects */
    fun batchDelete(
        toObjectType: String,
        params: BatchBatchDeleteParams,
    ): CompletableFuture<BatchResponseVoid> =
        batchDelete(toObjectType, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        toObjectType: String,
        params: BatchBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid> =
        batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: BatchBatchDeleteParams): CompletableFuture<BatchResponseVoid> =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: BatchBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid>

    /**
     * Batch delete specific association labels for objects. Deleting an unlabeled association will
     * also delete all labeled associations between those two objects
     */
    fun batchDeleteLabels(
        toObjectType: String,
        params: BatchBatchDeleteLabelsParams,
    ): CompletableFuture<BatchResponseVoid> =
        batchDeleteLabels(toObjectType, params, RequestOptions.none())

    /** @see batchDeleteLabels */
    fun batchDeleteLabels(
        toObjectType: String,
        params: BatchBatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid> =
        batchDeleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchDeleteLabels */
    fun batchDeleteLabels(
        params: BatchBatchDeleteLabelsParams
    ): CompletableFuture<BatchResponseVoid> = batchDeleteLabels(params, RequestOptions.none())

    /** @see batchDeleteLabels */
    fun batchDeleteLabels(
        params: BatchBatchDeleteLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseVoid>

    /**
     * Batch read associations for objects to specific object type. The 'after' field in a returned
     * paging object can be added alongside the 'id' to retrieve the next page of associations from
     * that objectId. The 'link' field is deprecated and should be ignored. Note: The 'paging' field
     * will only be present if there are more pages and absent otherwise.
     */
    fun batchRead(
        toObjectType: String,
        params: BatchBatchReadParams,
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel> =
        batchRead(toObjectType, params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        toObjectType: String,
        params: BatchBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel> =
        batchRead(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see batchRead */
    fun batchRead(
        params: BatchBatchReadParams
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel> =
        batchRead(params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        params: BatchBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/associate/default`, but is
         * otherwise the same as [BatchServiceAsync.batchAssociateDefault].
         */
        fun batchAssociateDefault(
            toObjectType: String,
            params: BatchBatchAssociateDefaultParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            batchAssociateDefault(toObjectType, params, RequestOptions.none())

        /** @see batchAssociateDefault */
        fun batchAssociateDefault(
            toObjectType: String,
            params: BatchBatchAssociateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            batchAssociateDefault(
                params.toBuilder().toObjectType(toObjectType).build(),
                requestOptions,
            )

        /** @see batchAssociateDefault */
        fun batchAssociateDefault(
            params: BatchBatchAssociateDefaultParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            batchAssociateDefault(params, RequestOptions.none())

        /** @see batchAssociateDefault */
        fun batchAssociateDefault(
            params: BatchBatchAssociateDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/create`, but is otherwise the
         * same as [BatchServiceAsync.batchCreate].
         */
        fun batchCreate(
            toObjectType: String,
            params: BatchBatchCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseLabelsBetweenObjectPair>> =
            batchCreate(toObjectType, params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            toObjectType: String,
            params: BatchBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseLabelsBetweenObjectPair>> =
            batchCreate(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchCreate */
        fun batchCreate(
            params: BatchBatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseLabelsBetweenObjectPair>> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            params: BatchBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseLabelsBetweenObjectPair>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/archive`, but is otherwise the
         * same as [BatchServiceAsync.batchDelete].
         */
        fun batchDelete(
            toObjectType: String,
            params: BatchBatchDeleteParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(toObjectType, params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            toObjectType: String,
            params: BatchBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDelete */
        fun batchDelete(
            params: BatchBatchDeleteParams
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            params: BatchBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/labels/archive`, but is
         * otherwise the same as [BatchServiceAsync.batchDeleteLabels].
         */
        fun batchDeleteLabels(
            toObjectType: String,
            params: BatchBatchDeleteLabelsParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDeleteLabels(toObjectType, params, RequestOptions.none())

        /** @see batchDeleteLabels */
        fun batchDeleteLabels(
            toObjectType: String,
            params: BatchBatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDeleteLabels(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchDeleteLabels */
        fun batchDeleteLabels(
            params: BatchBatchDeleteLabelsParams
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> =
            batchDeleteLabels(params, RequestOptions.none())

        /** @see batchDeleteLabels */
        fun batchDeleteLabels(
            params: BatchBatchDeleteLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise the
         * same as [BatchServiceAsync.batchRead].
         */
        fun batchRead(
            toObjectType: String,
            params: BatchBatchReadParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>> =
            batchRead(toObjectType, params, RequestOptions.none())

        /** @see batchRead */
        fun batchRead(
            toObjectType: String,
            params: BatchBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>> =
            batchRead(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see batchRead */
        fun batchRead(
            params: BatchBatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>> =
            batchRead(params, RequestOptions.none())

        /** @see batchRead */
        fun batchRead(
            params: BatchBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>>
    }
}
