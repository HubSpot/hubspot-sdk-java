// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot_sdk.api.models.cms.pages.PageData
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestCreateLandingPageVariationParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestCreateSitePageVariationParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestEndLandingPageTestParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestEndSitePageTestParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestRerunLandingPageTestParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestRerunSitePageTestParams
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
    fun createLandingPageVariation(
        params: ABTestCreateLandingPageVariationParams
    ): CompletableFuture<PageData> = createLandingPageVariation(params, RequestOptions.none())

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        params: ABTestCreateLandingPageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageData>

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageData> =
        createLandingPageVariation(
            ABTestCreateLandingPageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<PageData> =
        createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createSitePageVariation(
        params: ABTestCreateSitePageVariationParams
    ): CompletableFuture<PageData> = createSitePageVariation(params, RequestOptions.none())

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        params: ABTestCreateSitePageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageData>

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageData> =
        createSitePageVariation(
            ABTestCreateSitePageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createSitePageVariation */
    fun createSitePageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<PageData> =
        createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endLandingPageTest(params: ABTestEndLandingPageTestParams): CompletableFuture<Void?> =
        endLandingPageTest(params, RequestOptions.none())

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        params: ABTestEndLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        endLandingPageTest(
            ABTestEndLandingPageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endLandingPageTest */
    fun endLandingPageTest(abTestEndRequestVNext: AbTestEndRequestVNext): CompletableFuture<Void?> =
        endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endSitePageTest(params: ABTestEndSitePageTestParams): CompletableFuture<Void?> =
        endSitePageTest(params, RequestOptions.none())

    /** @see endSitePageTest */
    fun endSitePageTest(
        params: ABTestEndSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see endSitePageTest */
    fun endSitePageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        endSitePageTest(
            ABTestEndSitePageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endSitePageTest */
    fun endSitePageTest(abTestEndRequestVNext: AbTestEndRequestVNext): CompletableFuture<Void?> =
        endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunLandingPageTest(params: ABTestRerunLandingPageTestParams): CompletableFuture<Void?> =
        rerunLandingPageTest(params, RequestOptions.none())

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        params: ABTestRerunLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rerunLandingPageTest(
            ABTestRerunLandingPageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext
    ): CompletableFuture<Void?> =
        rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunSitePageTest(params: ABTestRerunSitePageTestParams): CompletableFuture<Void?> =
        rerunSitePageTest(params, RequestOptions.none())

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        params: ABTestRerunSitePageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rerunSitePageTest(
            ABTestRerunSitePageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunSitePageTest */
    fun rerunSitePageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext
    ): CompletableFuture<Void?> = rerunSitePageTest(abTestRerunRequestVNext, RequestOptions.none())

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
         * /cms/pages/2026-03/landing-pages/ab-test/create-variation`, but is otherwise the same as
         * [ABTestServiceAsync.createLandingPageVariation].
         */
        fun createLandingPageVariation(
            params: ABTestCreateLandingPageVariationParams
        ): CompletableFuture<HttpResponseFor<PageData>> =
            createLandingPageVariation(params, RequestOptions.none())

        /** @see createLandingPageVariation */
        fun createLandingPageVariation(
            params: ABTestCreateLandingPageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageData>>

        /** @see createLandingPageVariation */
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageData>> =
            createLandingPageVariation(
                ABTestCreateLandingPageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLandingPageVariation */
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): CompletableFuture<HttpResponseFor<PageData>> =
            createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/ab-test/create-variation`, but is otherwise the same as
         * [ABTestServiceAsync.createSitePageVariation].
         */
        fun createSitePageVariation(
            params: ABTestCreateSitePageVariationParams
        ): CompletableFuture<HttpResponseFor<PageData>> =
            createSitePageVariation(params, RequestOptions.none())

        /** @see createSitePageVariation */
        fun createSitePageVariation(
            params: ABTestCreateSitePageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageData>>

        /** @see createSitePageVariation */
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageData>> =
            createSitePageVariation(
                ABTestCreateSitePageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createSitePageVariation */
        fun createSitePageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): CompletableFuture<HttpResponseFor<PageData>> =
            createSitePageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/end`, but
         * is otherwise the same as [ABTestServiceAsync.endLandingPageTest].
         */
        fun endLandingPageTest(
            params: ABTestEndLandingPageTestParams
        ): CompletableFuture<HttpResponse> = endLandingPageTest(params, RequestOptions.none())

        /** @see endLandingPageTest */
        fun endLandingPageTest(
            params: ABTestEndLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see endLandingPageTest */
        fun endLandingPageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            endLandingPageTest(
                ABTestEndLandingPageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endLandingPageTest */
        fun endLandingPageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext
        ): CompletableFuture<HttpResponse> =
            endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/end`, but is
         * otherwise the same as [ABTestServiceAsync.endSitePageTest].
         */
        fun endSitePageTest(params: ABTestEndSitePageTestParams): CompletableFuture<HttpResponse> =
            endSitePageTest(params, RequestOptions.none())

        /** @see endSitePageTest */
        fun endSitePageTest(
            params: ABTestEndSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see endSitePageTest */
        fun endSitePageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            endSitePageTest(
                ABTestEndSitePageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endSitePageTest */
        fun endSitePageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext
        ): CompletableFuture<HttpResponse> =
            endSitePageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/rerun`,
         * but is otherwise the same as [ABTestServiceAsync.rerunLandingPageTest].
         */
        fun rerunLandingPageTest(
            params: ABTestRerunLandingPageTestParams
        ): CompletableFuture<HttpResponse> = rerunLandingPageTest(params, RequestOptions.none())

        /** @see rerunLandingPageTest */
        fun rerunLandingPageTest(
            params: ABTestRerunLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rerunLandingPageTest */
        fun rerunLandingPageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rerunLandingPageTest(
                ABTestRerunLandingPageTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunLandingPageTest */
        fun rerunLandingPageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext
        ): CompletableFuture<HttpResponse> =
            rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/ab-test/rerun`, but
         * is otherwise the same as [ABTestServiceAsync.rerunSitePageTest].
         */
        fun rerunSitePageTest(
            params: ABTestRerunSitePageTestParams
        ): CompletableFuture<HttpResponse> = rerunSitePageTest(params, RequestOptions.none())

        /** @see rerunSitePageTest */
        fun rerunSitePageTest(
            params: ABTestRerunSitePageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rerunSitePageTest */
        fun rerunSitePageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rerunSitePageTest(
                ABTestRerunSitePageTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunSitePageTest */
        fun rerunSitePageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext
        ): CompletableFuture<HttpResponse> =
            rerunSitePageTest(abTestRerunRequestVNext, RequestOptions.none())
    }
}
