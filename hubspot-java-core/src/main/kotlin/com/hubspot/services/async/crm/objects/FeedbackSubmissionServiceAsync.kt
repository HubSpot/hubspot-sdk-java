// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionGetParams
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListPageAsync
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListParams
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionSearchParams
import com.hubspot.services.async.crm.objects.feedbacksubmissions.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeedbackSubmissionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackSubmissionServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Read a page of feedback submissions. Control what is returned via the `properties` query
     * param.
     */
    fun list(): CompletableFuture<FeedbackSubmissionListPageAsync> =
        list(FeedbackSubmissionListParams.none())

    /** @see list */
    fun list(
        params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSubmissionListPageAsync>

    /** @see list */
    fun list(
        params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none()
    ): CompletableFuture<FeedbackSubmissionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FeedbackSubmissionListPageAsync> =
        list(FeedbackSubmissionListParams.none(), requestOptions)

    /**
     * Read an Object identified by `{feedbackSubmissionId}`. `{feedbackSubmissionId}` refers to the
     * internal object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(feedbackSubmissionId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(feedbackSubmissionId, FeedbackSubmissionGetParams.none())

    /** @see get */
    fun get(
        feedbackSubmissionId: String,
        params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().feedbackSubmissionId(feedbackSubmissionId).build(), requestOptions)

    /** @see get */
    fun get(
        feedbackSubmissionId: String,
        params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(feedbackSubmissionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeedbackSubmissionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(
        params: FeedbackSubmissionGetParams
    ): CompletableFuture<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        feedbackSubmissionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(feedbackSubmissionId, FeedbackSubmissionGetParams.none(), requestOptions)

    /**
     * Execute a search to retrieve feedback submissions based on defined filters, properties, and
     * sorting options.
     */
    fun search(
        params: FeedbackSubmissionSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: FeedbackSubmissionSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            FeedbackSubmissionSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [FeedbackSubmissionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackSubmissionServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/feedback_submissions`, but is
         * otherwise the same as [FeedbackSubmissionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FeedbackSubmissionListPageAsync>> =
            list(FeedbackSubmissionListParams.none())

        /** @see list */
        fun list(
            params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSubmissionListPageAsync>>

        /** @see list */
        fun list(
            params: FeedbackSubmissionListParams = FeedbackSubmissionListParams.none()
        ): CompletableFuture<HttpResponseFor<FeedbackSubmissionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FeedbackSubmissionListPageAsync>> =
            list(FeedbackSubmissionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/feedback_submissions/{feedbackSubmissionId}`, but is otherwise the
         * same as [FeedbackSubmissionServiceAsync.get].
         */
        fun get(
            feedbackSubmissionId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(feedbackSubmissionId, FeedbackSubmissionGetParams.none())

        /** @see get */
        fun get(
            feedbackSubmissionId: String,
            params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(
                params.toBuilder().feedbackSubmissionId(feedbackSubmissionId).build(),
                requestOptions,
            )

        /** @see get */
        fun get(
            feedbackSubmissionId: String,
            params: FeedbackSubmissionGetParams = FeedbackSubmissionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(feedbackSubmissionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FeedbackSubmissionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: FeedbackSubmissionGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            feedbackSubmissionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(feedbackSubmissionId, FeedbackSubmissionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/feedback_submissions/search`,
         * but is otherwise the same as [FeedbackSubmissionServiceAsync.search].
         */
        fun search(
            params: FeedbackSubmissionSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: FeedbackSubmissionSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                FeedbackSubmissionSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
