/*
 * Copyright 2017 Peter Bencze.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.peterbencze.serritor.api.event;

import com.github.peterbencze.serritor.api.CrawlCandidate;
import com.github.peterbencze.serritor.api.PartialCrawlResponse;
import com.github.peterbencze.serritor.internal.EventObject;

/**
 * Event which gets delivered when the content type of the response is not text/html.
 */
public final class NonHtmlResponseEvent extends EventObject {

    private final PartialCrawlResponse partialCrawlResponse;

    /**
     * Creates a {@link NonHtmlResponseEvent} instance.
     *
     * @param crawlCandidate       the current crawl candidate
     * @param partialCrawlResponse the partial crawl response
     */
    public NonHtmlResponseEvent(
            final CrawlCandidate crawlCandidate,
            final PartialCrawlResponse partialCrawlResponse) {
        super(crawlCandidate);

        this.partialCrawlResponse = partialCrawlResponse;
    }

    /**
     * Returns the partial crawl response.
     *
     * @return the partial crawl response
     */
    public PartialCrawlResponse getPartialCrawlResponse() {
        return partialCrawlResponse;
    }
}
