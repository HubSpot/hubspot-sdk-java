// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestRerunAbTestParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ABTestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestServiceAsync

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createAbTestVariation(params: ABTestCreateAbTestVariationParams): CompletableFuture<Page> =
        createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: ABTestCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        createAbTestVariation(
            ABTestCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<Page> =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endAbTest(params: ABTestEndAbTestParams): CompletableFuture<Void?> =
        endAbTest(params, RequestOptions.none())

    /** @see endAbTest */
    fun endAbTest(
        params: ABTestEndAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see endAbTest */
    fun endAbTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        endAbTest(
            ABTestEndAbTestParams.builder().abTestEndRequestVNext(abTestEndRequestVNext).build(),
            requestOptions,
        )

    /** @see endAbTest */
    fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext): CompletableFuture<Void?> =
        endAbTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunAbTest(params: ABTestRerunAbTestParams): CompletableFuture<Void?> =
        rerunAbTest(params, RequestOptions.none())

    /** @see rerunAbTest */
    fun rerunAbTest(
        params: ABTestRerunAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rerunAbTest */
    fun rerunAbTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rerunAbTest(
            ABTestRerunAbTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunAbTest */
    fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): CompletableFuture<Void?> =
        rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

    /**
     * A view of [ABTestServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ABTestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/ab-test/create-variation`, but is otherwise the same as
         * [ABTestServiceAsync.createAbTestVariation].
         */
        fun createAbTestVariation(
            params: ABTestCreateAbTestVariationParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            params: ABTestCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(
                ABTestCreateAbTestVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/end`, but is
         * otherwise the same as [ABTestServiceAsync.endAbTest].
         */
        fun endAbTest(params: ABTestEndAbTestParams): CompletableFuture<HttpResponse> =
            endAbTest(params, RequestOptions.none())

        /** @see endAbTest */
        fun endAbTest(
            params: ABTestEndAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see endAbTest */
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            endAbTest(
                ABTestEndAbTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endAbTest */
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext
        ): CompletableFuture<HttpResponse> = endAbTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/rerun`, but
         * is otherwise the same as [ABTestServiceAsync.rerunAbTest].
         */
        fun rerunAbTest(params: ABTestRerunAbTestParams): CompletableFuture<HttpResponse> =
            rerunAbTest(params, RequestOptions.none())

        /** @see rerunAbTest */
        fun rerunAbTest(
            params: ABTestRerunAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rerunAbTest */
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rerunAbTest(
                ABTestRerunAbTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunAbTest */
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext
        ): CompletableFuture<HttpResponse> =
            rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())
    }
}
